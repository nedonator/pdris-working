package app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface DbWorker extends CrudRepository<RbkDb, Long> {


    //Optional<RbkDb> findById(String date);

    //Double findCurrencyById(Long id);
    Optional<RbkDb> findByDate(String date);
    Optional<RbkDb> findById(String date);
    //Optional<ArrayList<String>> getAllDates();
    //List<RbkDb> fillLastDays(int days);
}
