package tn.ssbe.tn.SpringBootWork.Services;

import java.util.List;
import java.util.Optional;

import tn.ssbe.tn.SpringBootWork.entities.TypeOffre;

public interface InterTypeOffreService {

	public List<TypeOffre> getAllTypeOffres();
	
	public Optional<TypeOffre> getTypeOffreById(Long idTypeOffre);
	
	
}
