import { Component, OnInit } from '@angular/core';
import { LancamentoService } from '../../service/lancamento.service';

@Component({
  selector: 'app-lancamento',
  templateUrl: './lancamento.component.html',
  styleUrls: ['./lancamento.component.css']
})
export class LancamentoComponent implements OnInit {

  constructor(private lancamentoService: LancamentoService) { }

  private lancamentos: any;

  private lancamentosVo: any;

  
  headElements = ['Data do lançamento', 'Descrição', 'Número ', 'Situação ', 
  'Data de confirmação', 'Dados bancários', 'Valor final'];

  ngOnInit() {
    /*
    this.lancamentoService.getLancamentos().subscribe((lanc : any) => {
      this.lancamentos = lanc;
    });
    */

    this.lancamentoService.getLancamentoPersonalizado().subscribe((lanc : any) => {
      this.lancamentosVo = lanc;
    });
  }

}
