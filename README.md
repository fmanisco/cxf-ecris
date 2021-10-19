# cxf-ecris

_mock_

suite di app per
- esporre 
- interrogare 
- testare 

ws di tipo soap, tramite wsdl ecris




## moduli

- cxf-provider-ecris

ms che espone il wsdl e i relativi metodi

```
http://localhost:<port>/cxf/

http://localhost:8380/cxf/ecris?wsdl

```

- cxf-consumer-ecris

libreria che permette l'invocazione dei metodi esposti dal provider

(da verificare configurazione, attualmente statica)


- cxf-test-ecris

modulo che ha una dipendenza verso  _cxf-consumer-ecris_

contiene test jUnit per invocare i servizi tramite il client

(attualmente solo 2) 

