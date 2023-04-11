package com.edlog.api.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.edlog.api.enums.DeliveryStatus;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Delivery {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="client_id")
	private Client client;
	
	@Embedded
	private Recipient recipient;
	
	private BigDecimal rate;
	
	@Enumerated(EnumType.STRING)
	private DeliveryStatus deliveryStatus;
	
	private LocalDateTime requestDate;
	
	private LocalDateTime completionDate;
	

	
}
