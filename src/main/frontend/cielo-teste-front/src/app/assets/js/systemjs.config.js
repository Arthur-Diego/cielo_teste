/**
 * System configuration for Angular samples
 * Adjust as necessary for your application needs.
 */
(function (global) {
  System.config({
    paths: {
      // paths serve as alias
      'npm:': 'js/'
    },
    bundles: {
        'js/app/app': ['main']
    },
    // map tells the System loader where to look for things
    map: {
      // our app is within the app folder
      app: 'js/app',
      // angular bundles
      '@angular/core': 'npm:@angular/core/bundles/core.umd.js',
      '@angular/common': 'npm:@angular/common/bundles/common.umd.js',
      '@angular/compiler': 'npm:@angular/compiler/bundles/compiler.umd.js',
      '@angular/platform-browser': 'npm:@angular/platform-browser/bundles/platform-browser.umd.js',
      '@angular/platform-browser-dynamic': 'npm:@angular/platform-browser-dynamic/bundles/platform-browser-dynamic.umd.js',
      '@angular/http': 'npm:@angular/http/bundles/http.umd.js',
      '@angular/http/testing': 'npm:@angular/http/bundles/http-testing.umd.js',
      '@angular/router': 'npm:@angular/router/bundles/router.umd.js',
      '@angular/forms': 'npm:@angular/forms/bundles/forms.umd.js',
      // other libraries
      "angular2-jwt": "npm:angular2-jwt/angular2-jwt.js",
      'enum-values': 'npm:enum-values/src/enumValues.js',
      'rxjs':                      'npm:rxjs'
    },
    // packages tells the System loader how to load when no filename and/or no extension
    packages: {
      app: {
        main: './app.js',
        defaultExtension: 'js'
      },
      rxjs: {
        defaultExtension: 'js'
      }

    }
  });
})(this);