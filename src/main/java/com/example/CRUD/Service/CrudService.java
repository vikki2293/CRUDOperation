package com.example.CRUD.Service;

import com.example.CRUD.Model.User;
import com.example.CRUD.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CrudService {

    private final UserRepository repo;

    public CrudService(UserRepository repo)
    {
        this.repo = repo;
    }

    public User saveUser(User user)
    {
        return repo.save(user);
    }

    public List<User> getAllUsers()
    {
        return repo.findAll();
    }

    public Optional<User> getUserbyId(Long id)
    {
        return repo.findById(id);
    }

    public void deleteUserbyId(Long id)
    {
        repo.deleteById(id);
    }

}
