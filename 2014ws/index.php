<!doctype html>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Programmieren Tutoriumsunterlagen</title>
<link rel=stylesheet href="lib/bootstrap.min.css">
<script src="lib/jquery.min.js"></script>
<script src="lib/bootstrap.min.js"></script>
<style>
	.nav { margin-top: 20px}
	.nav-tabs > li { font-size:150%; }
</style>	
<div class="container">
	<h1>Tutoriumsunterlagen</h1>
	<hr>
	<h2>Links</h2>
	<ul><script type=λ>
		λlinks→(<li>λkey: <a href="λval">λval</a>)
	</script></ul>

	<ul class="nav nav-tabs" role="tablist">
		<li role="presentation" class="active"><a href="#robin" role="tab" data-toggle="tab">Robin</a>
		<li role="presentation"><a href="#tino" role="tab" data-toggle="tab">Tino</a>
	</ul>

	<div id="tab-contents" class="tab-content" >
		<div class="tab-pane active fade in" id="robin">
		<!--begin robin/--><?php readfile('robin/index.html'); ?><!--end robin/-->
		</div>
		<div class="tab-pane fade" id="tino">
			<!--begin tino/--><?php readfile('tino/index.html'); ?><!--end tino/-->
		</div>
	</div>
</div>
<script src="lib/lam_fill/λ.js"></script>
<script>
var links = {
	"Praktomat (Blattabgabe)":"https://praktomat.cs.kit.edu/2014_WS/",
	"Vorlesungswebseite (Übungsblätter, Vorlesungsfolien)":"https://sdqweb.ipd.kit.edu/wiki/Vorlesung_Programmieren_WS14/15",
	"Ilias (Foren, Wiki)": "https://ilias.studium.kit.edu/goto_produktiv_crs_349149.html",
	"Vorlesungsaufzeichnung": "https://www.youtube.com/playlist?list=PL22ZNLSohCRE1rUJW_5SJY6B_HiPAblob"
};
λ_fill.auto();
if(location.hash)
	$('.nav-tabs a[href='+location.hash+']').tab('show');
$('.nav-tabs a').on('shown.bs.tab', function(e) {
	location.hash = e.target.hash;
	ga('send','pageview',location.pathname+location.search+location.hash);
});
$("a").each(function(i,e) {
	$(e).click(function(ev){
		ga('send','event','outbound','click',e.href,
			{'hitCallback':function(){
				document.location=e.href;
			}});
		if(!(ga.hasOwnProperty('loaded')||ga.loaded!==true)) ev.preventDefault();
	});
});
</script>
<script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-39197996-4', 'auto');
  ga('require', 'displayfeatures');
  ga('require', 'linkid', 'linkid.js');
  ga('send', 'pageview', location.pathname + location.search + location.hash);
</script>
