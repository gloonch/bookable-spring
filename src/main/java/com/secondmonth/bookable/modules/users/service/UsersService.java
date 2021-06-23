package com.secondmonth.bookable.modules.users.service;

import com.secondmonth.bookable.modules.users.model.Users;
import com.secondmonth.bookable.modules.users.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Service
public class UsersService {

    UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Users registerUser(Users users) throws IOException {
//        getting image name
        String path = ResourceUtils.getFile("classpath:static/images/").getPath();
        byte[] bytes = users.getFile().getBytes();

//        writing the particular data with a compatible system file separator based on the OS
        Files.write(Paths.get(path + File.separator + users.getFile().getOriginalFilename()), bytes);
        users.setCover(users.getFile().getOriginalFilename());

        return usersRepository.save(users);
    }

    public List<Users> findAll() {
        return usersRepository.findAll();
    }
}
