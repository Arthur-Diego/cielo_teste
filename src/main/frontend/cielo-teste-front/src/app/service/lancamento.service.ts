import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { retry, catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class LancamentoService {

  url = 'http://localhost:8080/lancamentos';
  urlResumo = 'http://localhost:8080/lancamentos/resumo';

  constructor(private httpClient: HttpClient) { }

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  }


  getLancamentos(): Observable<any> {
    return this.httpClient.get<any>(this.url)
      .pipe(
        catchError(this.handleError));
  }

  getLancamentoPersonalizado(): Observable<any> {
    return this.httpClient.get<any>(this.urlResumo)
      .pipe(
        catchError(this.handleError));
  }

  handleError(error: HttpErrorResponse) {
    let errorMessage = '';
    if (error.error instanceof ErrorEvent) {
      errorMessage = error.error.message;
    } else {
      errorMessage = `Código do erro: ${error.status}, ` + `mensagem: ${error.message}`;
    }
    return throwError(errorMessage);
  };

}
