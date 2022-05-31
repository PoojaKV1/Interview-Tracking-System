package com.track.test.serviceimpl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.track.entity.Admin;
import com.track.entity.Candidate;
import com.track.repository.AdminRepository;
import com.track.repository.CandidateRepository;
import com.track.serviceimpl.AdminServiceImpl;
import com.track.serviceimpl.CandidateServiceImpl;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminImplTest {
	@Autowired
	public AdminServiceImpl adminServiceImpl;

	@MockBean
	private AdminRepository adminRepo;

	@Test
	public void addCandidate() {

		Admin admin = new Admin();

		admin.setUserId(20);
		admin.setName("pooja");
		admin.setGender("female");

		admin.setUserName("pooja");
		admin.setPassword("12344");

		admin.setDesignation("Analyst");


		Mockito.when(adminRepo.save(admin)).thenReturn(admin);
		assertThat(adminServiceImpl.addCandidate(admin)).isEqualTo(admin);
	}

	/*@Test
	public void throwExceptionWhenUserIdNotFound() {
	    int id = anyInt();
	    when(adminRepo.findById(id)).thenReturn(Optional.empty());
	    assertThatAnExceptionWasThrown(String.format("Quarter does not exist for id = %s!", id));
	}*/
	
	private void assertThatAnExceptionWasThrown(String format) {
		
	}

	@Test
	public void scheduleCandidateInterview() {

		Admin admin = new Admin();

		admin.setUserId(20);
		admin.setName("pooja");
		admin.setGender("female");

		admin.setUserName("pooja");
		admin.setPassword("12344");

		admin.setDesignation("Analyst");

		

		Mockito.when(adminRepo.save(admin)).thenReturn(admin);
		assertThat(adminServiceImpl.scheduleCandidateInterview(admin)).isEqualTo(admin);

	}

@Test
	public void shareTheCandidateWithInterviewPanel() {

		Admin admin = new Admin();

		admin.setUserId(20);
		admin.setName("pooja");
		admin.setGender("female");

		admin.setUserName("pooja");
		admin.setPassword("12344");

		admin.setDesignation("Analyst");

		

		Mockito.when(adminRepo.save(admin)).thenReturn(admin);
		assertThat(adminServiceImpl.shareTheCandidateWithInterviewPanel(20)).isEqualTo(admin);

	}

}

