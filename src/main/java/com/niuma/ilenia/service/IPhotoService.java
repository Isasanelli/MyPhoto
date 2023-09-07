package com.niuma.ilenia.service;

import com.niuma.ilenia.model.Photo;

import java.util.Optional;

public interface IPhotoService {
    public Iterable<Photo> getAll();
    public Optional<Photo> getById(int id);
    public Photo create (Photo photo) ;
    public Optional<Photo> update(int id, Photo photo);
    public Boolean delete(int id);
}

