package dev.gmorikawa.library.repository;

import dev.gmorikawa.library.models.Member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    @Query("SELECT x FROM Member x WHERE x.email = :email")
    Optional<Member> findByEmail(@Param("email") String email);

}
