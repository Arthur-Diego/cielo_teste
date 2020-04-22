import { Routes, RouterModule } from '@angular/router';

import { LancamentoComponent } from './component/lancamento/lancamento.component';

const appRoutes: Routes = [
    { path: '', component: LancamentoComponent },
   
    // otherwise redirect to home
    { path: '**', redirectTo: '' }
];

export const routing = RouterModule.forRoot(appRoutes, { useHash: true });
