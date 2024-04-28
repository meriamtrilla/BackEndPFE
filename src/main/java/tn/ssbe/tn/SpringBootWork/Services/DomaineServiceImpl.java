package tn.ssbe.tn.SpringBootWork.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.ssbe.tn.SpringBootWork.Repository.IDomaineRepository;
import tn.ssbe.tn.SpringBootWork.entities.Domaine;


@Service
public class DomaineServiceImpl implements InterDomaineService {
	@Autowired
	IDomaineRepository repDomaine;

	public Domaine getdomainById(long idDomaine) {
		// TODO Auto-generated method stub
		return repDomaine.findById(idDomaine).orElse(null);
	}

	@Override
	public Domaine addDomaine(Domaine domaine) {
		// TODO Auto-generated method stub
		return repDomaine.save(domaine);
	}

	@Override
	public List<Domaine> getDomaines() {
		// TODO Auto-generated method stub
		return repDomaine.findAll();
	}

	
}
