package com.hey.givumethemoney.service;

import com.hey.givumethemoney.domain.Donation;
import com.hey.givumethemoney.repository.JPADonationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class donationApplicationService {

    @Autowired
    private JPADonationRepository donationRepository;

    public Donation saveDonation(Donation donation) {
        return donationRepository.save(donation);
    }

    public List<Donation> getDonations() {
        return donationRepository.findAll();
    }

    public Optional<Donation> getDonationById(Long id)
    {
        return donationRepository.findById(id);
    }

}
