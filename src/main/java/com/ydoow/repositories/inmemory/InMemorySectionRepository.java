package com.ydoow.repositories.inmemory;

import java.util.*;
import com.ydoow.models.Section;
import com.ydoow.repositories.base.SectionRepository;
import com.ydoow.utilities.IdGenerator;

public class InMemorySectionRepository implements SectionRepository{
    private final Map<Integer, Section> store = new HashMap();

    @Override
    public Section save(Section section){
        if(section.getId() != 0){
            section.setId(IdGenerator.nextId(Section.class));
        }
        store.put(section.getId(),section);
        return section;
    }

    @Override
    public Optional<Section> findById(Integer id){
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<Section> findAll(){
        return new ArrayList<>(store.values());
    }

    @Override
    public boolean delete(Integer id){
        return store.remove(id) != null;
    }
}
