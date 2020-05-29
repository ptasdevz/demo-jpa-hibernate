package com.ptasdevz.demojpahibernate;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;
public class AuditorAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        // Can use Spring Security to return currently logged in user
        //SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername()

        return Optional.of("jason");

    }
}
