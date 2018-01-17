package com.support.redmine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.support.redmine.domain.RedmineDetail;

@Repository
public interface RedmineRepository extends JpaRepository<RedmineDetail, Long> {

}
