package com.ydoow.repositories.base;

import com.ydoow.models.Section;
import java.util.Optional;
import java.util.List;

public interface SectionRepository {
    
    Section save(Section section);

    Optional<Section> findById(Integer id);

    List<Section> findAll();

    boolean delete(Integer id);

}
