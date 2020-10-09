package com.anandscode.msscbeerservice.web.mappers;

import com.anandscode.msscbeerservice.domain.Beer;
import com.anandscode.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto BeerToBeerDto(Beer beer);
    Beer BeerDtoToBeer(BeerDto beerDto);
}
