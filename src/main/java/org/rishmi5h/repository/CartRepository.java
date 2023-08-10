package org.rishmi5h.repository;

import org.rishmi5h.model.Cart;
import org.rishmi5h.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

    List<Cart> findAllByUserOrderByCreatedDateDesc(Users user);

    List<Cart> deleteByUser(Users user);
}
