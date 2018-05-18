package com.firm.demo.reposetory;

import com.firm.demo.model.Category;
import com.firm.demo.model.Directory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectoryRepository extends JpaRepository<Directory, Integer> {
}
