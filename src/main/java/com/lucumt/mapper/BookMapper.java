package com.lucumt.mapper;

import com.lucumt.model.BookModel;

import java.util.List;
import java.util.Optional;

public interface BookMapper {

    Optional<BookModel> findById(Integer id);

    List<BookModel> selectByType(Integer type);
}
