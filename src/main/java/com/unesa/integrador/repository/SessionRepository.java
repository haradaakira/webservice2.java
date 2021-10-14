package com.unesa.integrador.repository;

import com.unesa.integrador.model.SessionID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SessionRepository extends JpaRepository<SessionID, String> {
    List<SessionID> findAll();

    @Query(value = "SELECT SESSION_ID FROM SESSIONID WHERE ID = '1'", nativeQuery = true)
    public String getDbSessionId();

    @Modifying
    @Query(value = "UPDATE SESSIONID SET SESSION_ID = :id WHERE ID = '1'", nativeQuery = true)
    public void setDbSessionId(@Param("id") String id);

    @Modifying
    @Query(value = "UPDATE SESSIONID SET SESSION_ID = 'LOGOUT' WHERE ID = '1'", nativeQuery = true)
    public void removeDbSessionId();
}
