package com.pieropan.propostaapp.service;

import com.pieropan.propostaapp.dto.ProposalResponseDto;
import com.pieropan.propostaapp.entity.Proposal;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class NotificationService {

  private  RabbitTemplate rabbitTemplate;

  public void notify(Proposal proposal, String exchange) {
    rabbitTemplate.convertAndSend(exchange, "", proposal);
  }


}
