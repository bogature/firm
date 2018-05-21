package com.firm.demo.reposetory;

import com.firm.demo.model.Category;
import com.firm.demo.model.Defect;
import com.firm.demo.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;

public interface DefectRepository extends JpaRepository<Defect, Integer> {

    @Query("select count (def) from Defect def where def.time >= :startTime and def.time <= :finishTime ")
    int getCountDefectByDay(@Param("startTime") Date startTime, @Param("finishTime") Date finishTime);


    @Query(" select def from Defect def where def.time >= :startTime and def.time <= :finishTime")
    List<Defect> getDefectByDate(@Param("startTime") Date startTime, @Param("finishTime") Date finishTime);

}
