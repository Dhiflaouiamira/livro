package com.tekup.livraiso.mappers;



import org.modelmapper.ModelMapper;

import com.tekup.livraiso.dto.EvaluationDTO;
import com.tekup.livraiso.model.Evaluation;

public class EvaluationMapper {

	private static final ModelMapper modelMapper= new ModelMapper();

	public static EvaluationDTO convertToDto(Evaluation evaluation)
	{
		return modelMapper.map(evaluation, EvaluationDTO.class);
	}
	public static Evaluation convertToEntity(EvaluationDTO evaluationDTO)
	{
		return modelMapper.map(evaluationDTO, Evaluation.class);
	}
}
