# Тестовое задание для летней школы RBKmoney.

  <br>Так как в данной задаче присутствует фактор случайности, было решено повторить выполнение программы 10 раз. Я сразу же добавил свой тип торговца – "тактичный". Он принимает решение о сделке на основе общего показателя честности всех прочих торговцев, с которыми он совершал сделки ранее. 
  <br>Сначала было проведено 10 прогонов программы на 1 год торговли. Уже в первый год лишь в 2 из 10 случаев торговцам типа "альтруист" удалось "выжить", в остальных случаях в гильдии не оставалось торговцев данного типажа. 
  <br>Далее было проведено 10 прогонов программы на 10 лет. За данный период во всех 10 случаях из гильдии пропали торговцы типа "непредсказуемый", а также в 7 из 10 случаев пропали торговцы типа "хитрый".
  <br>Наконец было проведено 10 прогонов программы на 50 лет. В данном случае было получено следующее:
    <br>\t* Во всех 10 случаях из гильдии пропали торговцы типа "хитрый";
    <br>\t* В 7 из 10 случаев торговцы типа "ушлый" пропали из гильдии, среднее количество торговцев такого типа 2,4;
    <br>\t* В 9 из 10 случаев торговцы типа "злопамятный" оставались в гильдии, среднее количество торговцев такого типа 19,9;
    <br>\t* Торговцы типа "кидала" всегда оставались в гильдии, среднее количество "кидал" 25,9;
    <br>\t* Торговцы типа "тактичный" оставались в гильдии в 8 из 10 случаев, среднее количество тактичных торговцев 21,8.
  <br>Среднее количество торговцев было рассчитано как среднее арифметическое за 10 прогонов программы. 
  <br>На основе полученных данных можно сделать вывод, что наиболее выгодной стратегией в долгосрочной перспективе является "кидала", так как данный тип торговцев никогда не пропадает из гильдии и показатель среднего количества торговцев является наибольшим для данного типа.
  <br>На втором месте по выгодности можно расположить 2 типа торговцев: "злопамятные" и "тактичные". Торговцы первого типа реже пропадают из гильдии, а торговцы второго типа имеют больший показатель среднего количества торговцев.
  <br>Торговцы типа "ушлый" часто пропадают из гильдии и имеют низкий показатель среднего количества торговцев, а торговцы типа "хитрый" во всех случаях пропадают из гильдии, из чего можно сделать вывод, что данные стратегии не являются выгодными.
  <br>Так как было проведено лишь 10 прогонов, то погрешность остается большой и может не отражать полной картины, но это помогло получить представление об общем положении дел и том, какие стратегии являются наиболее и наименее выгодными.
