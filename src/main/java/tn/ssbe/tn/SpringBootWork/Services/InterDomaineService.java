package tn.ssbe.tn.SpringBootWork.Services;

import java.util.List;

import tn.ssbe.tn.SpringBootWork.entities.Domaine;

public interface InterDomaineService {
	
	public Domaine getdomainById(long idDomaine);
	
	public Domaine addDomaine(Domaine domaine);
	
	public List<Domaine> getDomaines();

}
