import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { registerLocaleData } from '@angular/common';
import br from '@angular/common/locales/br';

import { routing } from './app.routing';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import {LancamentoComponent } from './component/lancamento/lancamento.component';

registerLocaleData(br, 'pt-BR');

@NgModule({
  declarations: [
    AppComponent,
    LancamentoComponent
  ],
  imports: [
    BrowserModule,
    routing,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }