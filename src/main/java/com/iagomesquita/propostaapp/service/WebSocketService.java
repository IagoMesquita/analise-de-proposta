package com.iagomesquita.propostaapp.service;

import com.iagomesquita.propostaapp.dto.ProposalResponseDto;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class WebSocketService {

  private final SimpMessagingTemplate template;

  public WebSocketService(SimpMessagingTemplate template) {
    this.template = template;
  }

  public void  notify(ProposalResponseDto proposal) {
    template.convertAndSend("/propostas", proposal);
  }
}
