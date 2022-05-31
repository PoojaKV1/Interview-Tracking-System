    package com.track.serviceimpl;
	import java.util.Optional;
import java.util.function.IntPredicate;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.track.entity.Admin;
import com.track.entity.Candidate;
import com.track.exception.CandidateNotFoundException;
import com.track.repository.AdminRepository;
	import com.track.service.AdminService;


	@Service
	 public   class AdminServiceImpl implements AdminService {
		 

		 @Autowired
			private AdminRepository adminRepo;

		@Override
		public Admin addCandidate(Admin admin) {
			
			return adminRepo.save(admin);
		}
		@Override
		public  Admin scheduleCandidateInterview(Admin admin) {
			
			return adminRepo.save(admin);
		}

		@Override
		public  Admin shareTheCandidateWithInterviewPanel(int userId) throws CandidateNotFoundException{
			Optional<Admin> candidate = adminRepo.findById(userId);
			Admin candidat = null;
			if(candidate.isPresent()) {
				candidat = candidate.get();
			}else {
				throw new CandidateNotFoundException("No such candidate");
			}
			return candidat;
		}
		
		
			}
	

