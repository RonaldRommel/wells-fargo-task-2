package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import java.time.LocalDate;

@Entity
public class Portfolio {

  @Id
  @GeneratedValue()
  private long portfolioId;

  @OneToOne
  @JoinColumn(name = "clientId") // Foreign key in Employee table
  private Client client;

  @Column(nullable = false)
  private LocalDate creationDate;

  public Portfolio() {
  }

  public Portfolio(Client client, LocalDate creationDate) {
    this.client = client;
    this.creationDate = creationDate;
  }

  public long getPortfolioId() {
    return portfolioId;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public LocalDate getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }
}
