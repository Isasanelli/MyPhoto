package com.niuma.ilenia.mapper;

import com.niuma.ilenia.dto.PhotoDto;
import com.niuma.ilenia.model.Photo;
import org.mapstruct.Mapper;

/**
 * Mapper for Photo
 */
@Mapper
public interface PhotoMapper {

    /**
     * Convert dto to model
     * @param dto PhotoDto
     * @return a Photo
     */
    Photo dtoToModel(PhotoDto dto);

    /**
     * Convert model to dto
     * @param model Photo
     * @return a PhotoDto
     */
    PhotoDto modelToDto(Photo model);

}