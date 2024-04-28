package tn.ssbe.tn.SpringBootWork.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.ssbe.tn.SpringBootWork.Repository.ITypeOffreRepository;
import tn.ssbe.tn.SpringBootWork.entities.TypeOffre;
@Service

public class TypeOffreServiceImpl implements InterTypeOffreService {
	
	@Autowired
	ITypeOffreRepository TypeOffreRep;

	@Override
	public List<TypeOffre> getAllTypeOffres() {
		// TODO Auto-generated method stub
		return TypeOffreRep.findAll();
	}

	@Override
	public Optional<TypeOffre> getTypeOffreById(Long idTypeOffre) {
		// TODO Auto-generated method stub
		return TypeOffreRep.findById(idTypeOffre);
	}
	

}
