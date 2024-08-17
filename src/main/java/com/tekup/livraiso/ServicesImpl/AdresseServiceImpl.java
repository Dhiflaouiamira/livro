package com.tekup.livraiso.ServicesImpl;

import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tekup.livraiso.Repository.AdresseRepository;
import com.tekup.livraiso.Services.AdressService;
import com.tekup.livraiso.dto.AdresseDTO;
import com.tekup.livraiso.mappers.AdresseMapper;
import com.tekup.livraiso.model.Adresse;


@Service
public class AdresseServiceImpl implements AdressService {
private AdresseRepository adresseRepository;

	

	@Override
	public AdresseDTO addOneAdresse(AdresseDTO adresses) {
		return AdresseMapper.convertToDto(adresseRepository.save(AdresseMapper.convertToEntity(adresses)));

	}

	@Override
	public void deleteOneAdresse(long id) {
		adresseRepository.deleteById(id);
	
	}

	@Override
	public Page<AdresseDTO> getAllAdresse(Pageable pageable) {
		Page<Adresse> evaluations=adresseRepository.findAll(pageable);
		return evaluations.map(AdresseMapper::convertToDto);
	}





	

}
