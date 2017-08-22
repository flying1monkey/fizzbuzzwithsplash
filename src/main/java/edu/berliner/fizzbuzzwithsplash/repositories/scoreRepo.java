package edu.berliner.fizzbuzzwithsplash.repositories;

import edu.berliner.fizzbuzzwithsplash.models.Scores;
import org.springframework.data.repository.CrudRepository;

public interface scoreRepo extends CrudRepository<Scores,Long>
{

}
