package tn.ssbe.tn.SpringBootWork.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.ssbe.tn.SpringBootWork.Repository.IAdminRepository;
import tn.ssbe.tn.SpringBootWork.Repository.IUserRepository;
import tn.ssbe.tn.SpringBootWork.entities.Admin;


@Service
public class AdminServiceImpl implements InterAdminService{
	@Autowired
	IAdminRepository adminRep;
	@Autowired
	IUserRepository userRep;

	@Override
	public Admin addAdminEndUser(Admin admin) {
		// TODO Auto-generated method stub
		
		return adminRep.save(admin);
	}
	
	
	

}
