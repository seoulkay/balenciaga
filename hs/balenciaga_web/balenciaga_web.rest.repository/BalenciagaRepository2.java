package balenciaga_web.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import balenciaga_web.rest.entity.Subscribe;

public interface BalenciagaRepository2 extends JpaRepository<Subscribe, Long> {
	 List<Subscribe> findByInputEmail (String inputEmail);
	}
