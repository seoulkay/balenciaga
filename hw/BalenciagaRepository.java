package balenciaga_web.rest.repository;

//import java.util.List;

import java.util.Optional;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import balenciaga_web.rest.entity.Reply;


public interface BalenciagaRepository extends JpaRepository<Reply, Long> {
	  Page<Reply> findAll(Pageable pageable);
	  Page<Reply> findByOrderByIdDesc(Pageable pageable);
	  
	  Page<Reply> findByPublished(boolean published,  Pageable pageable);
	  Page<Reply> findByContentContaining(String content,  Pageable pageable);
	  Optional<Reply> findById(long id);
	  Optional<Reply> deleteById(long id);
	}


//public interface BalenciagaRepository extends JpaRepository<Reply, Long> {
//	List<Reply> findByPublished(boolean published);
//	  List<Reply> findByContentContaining(String content);
//	  Optional<Reply> findById(long id);
//	  Optional<Reply> deleteById(long id);
//	}
