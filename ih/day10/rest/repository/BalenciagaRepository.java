package balenciaga_web.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import balenciaga_web.rest.entity.Reply;

public interface BalenciagaRepository extends JpaRepository<Reply, Long> {
	  List<Reply> findByPublished(boolean published);
	  List<Reply> findByContentContaining(String content);
	}
