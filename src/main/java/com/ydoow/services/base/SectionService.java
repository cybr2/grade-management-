package com.ydoow.services.base;

import java.util.*;

import com.ydoow.models.Section;

public interface SectionService {

    public Section create(String name);

    public Optional<Section> findById(Integer id);

    public List<Section> findAll();

    void delete(Integer id);

}