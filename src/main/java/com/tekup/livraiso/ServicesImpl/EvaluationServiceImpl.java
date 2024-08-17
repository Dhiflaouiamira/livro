package com.tekup.livraiso.ServicesImpl;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tekup.livraiso.Repository.EvaluationRepository;
import com.tekup.livraiso.Services.EvaluationService;
import com.tekup.livraiso.dto.EvaluationDTO;
import com.tekup.livraiso.mappers.EvaluationMapper;


@Service
public class EvaluationServiceImpl implements EvaluationService {

private EvaluationRepository evaluationRepository;

	

	@Override
	public EvaluationDTO addOneEvaluation(EvaluationDTO evalution) {
		return EvaluationMapper.convertToDto(evaluationRepository.save(EvaluationMapper.convertToEntity(evalution)));

	}

	@Override
	public void deleteOneEvaluation(long id) {
		evaluationRepository.deleteById(id);
	
	}

	@Override
	public Page<EvaluationDTO> getAllEvaluation(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}



	


}
