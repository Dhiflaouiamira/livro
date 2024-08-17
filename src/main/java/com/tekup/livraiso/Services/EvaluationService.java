package com.tekup.livraiso.Services;




import org.springframework.data.domain.Page;

import com.tekup.livraiso.dto.EvaluationDTO;



public interface EvaluationService {
	public Page<EvaluationDTO> getAllEvaluation(org.springframework.data.domain.Pageable pageable) ;
	public EvaluationDTO  addOneEvaluation(EvaluationDTO evaluation);
	public void deleteOneEvaluation(long id);
	
}

