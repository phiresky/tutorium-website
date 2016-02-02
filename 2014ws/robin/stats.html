<!doctype html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="http://code.highcharts.com/highcharts.js"></script>
<script type=lul id=final>
0
0
0
0
24.5
65
83.5
77
62
82.5
78
108.5
62.5
63.5
121.5
64.5
64
71
61
57
81
104
67.5
61.5
23.5
88
</script>
<script type=lul id=avg>
2	3.5681818182	3.6818181818	6.1818181818	6.2368421053	2.95	2.6904761905	8.275	7.8333333333	3.2619047619	2.0833333333	5.6470588235	1.875	7.7727272727	6.1944444444	4.0357142857	5.25	3.65	1.8	10.5909090909
</script>
<script type=lul id=names>
Blatt1-A
Blatt1-B
Blatt1-C
Blatt2-A
Blatt2-B
Blatt2-C
Blatt2-D
Blatt3-A
Blatt3-B
Blatt3-C
Blatt3-D
Blatt4-A
Blatt4-B
Blatt4-C
Blatt5-A
Blatt5-B
Blatt5-C
Blatt6-A
Blatt6-B
Blatt6-C
</script>
<script type=lul id=max>
2
4
4
7
8
4
3
10
10
4
3
8
2
12
8
6
8
4
2
16
</script>
<script type=lul id=avgincl>
1.9130434783	3.4130434783	3.5217391304	5.9130434783	5.152173913	2.5652173913	2.4565217391	7.1956521739	6.1304347826	2.9782608696	0.5434782609	4.1739130435	1.6304347826	3.7173913043	4.847826087	2.4565217391	2.2826086957	1.5869565217	0.7826086957	5.0652173913
</script>
<div id=fstats></div>
<script>
function parse(ele,p) {
	p = p?function(q){return q;}:parseFloat;
	return ele.textContent.trim().split(/\s+/).map(function(e){return p(e.trim());});
}
function s(a,b){return a-b;}
function p(a,b){return a+b;}
var maxp = parse(max).reduce(p);
var count = parse(final).length-1;
$(function() {
	$("<div>").appendTo("#fstats").highcharts({
		chart:{ type:'column'},
		title:{ text:'Gesamtpunktzahl'},
		xAxis:{ title:{ text:'Person'}},
		yAxis:{ min:0, max:maxp, title:{ text:'Punkte'}},
		series:[
			{data:[[0,59],[count,59]],type:'line',name:'Bestanden',marker:{enabled:false}},
			{data:[[0,maxp],[count,maxp]],type:'line',name:'Volle Punktzahl',marker:{enabled:false}},
			{name:'Punkte',data:parse(final).sort(s)}
		],
	});
	var maxv = parse(max);
	var nam = parse(names);
	var fmt = function(e,i){return 100*e/maxv[i]};
	var conf={
		chart:{ type:'column'},
		title:{ text:'Durchschnittlicher Punkteanteil'},
		xAxis:{ title:{ text:'Aufgabe'},categories:parse(names,true)},
		yAxis:{ min:0, max:100, title:{ text:'Punkteanteil'},labels:{format:'{value}%'}},
		series:[
			{name:'Punkteanteil',data:parse(avg).map(fmt)}
		],
	};
	$("<div>").appendTo("#fstats").highcharts(conf);
	conf.series[0].data=parse(avgincl).map(fmt);
	conf.title.text = 'Durchschnittlicher Punkteanteil, inklusive Nichtabgaben';
	$("<div>").appendTo("#fstats").highcharts(conf);
});
</script>
