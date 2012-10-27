package streaming.model;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.dao.DataAccessException;

@Repository
@Transactional
public class EntityManagerStreaming  {

	@PersistenceContext
	private EntityManager em;
//Test

	
}
