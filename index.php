<?php $people = ['tino','nina']; ?>
<!doctype html>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Tutoriumsunterlagen</title>
<link rel=stylesheet href="lib/bootstrap.min.css">
<script src="lib/jquery.min.js"></script>
<script src="lib/bootstrap.min.js"></script>
<style>
	.nav { margin-top: 20px}
	.nav-tabs > li { font-size:150%; }
body { transform: rotate(1deg);}
</style>
<div class="container">
	<h1>Tutoriumsunterlagen 2015 SS <small><small><a href='2014ws'>2014 WS</a></small></small></h1>
	<hr>
	
	<ul class="nav nav-tabs" role="tablist">
		<?php foreach($people as $i=>$person) {
			echo("<li role=presentation class="
				.($i==0?"active":"")
				."><a href='#$person' role=tab data-toggle=tab>"
				.ucfirst($person)
				."</a>");
		} ?>
	</ul>

	<div id="tab-contents" class="tab-content">
		<?php foreach($people as $i=>$person) {
			$active = $i==0?'active fade in':'';
			echo("<div class='tab-pane $active' id='$person'><!--begin $person/-->");
			readfile("$person/index.html");
			echo("<!--end $person/--></div>");
		} ?>
	</div>
</div>

<script type="text/tmpl-noauto" id="linklist">
<h2>Links</h2>
<ul>
	\links->(<li>\key: <a href="\val">\val</a>)
</ul>
</script>

<script type="text/tmpl-noauto" id=folien>
<h2>Folien</h2>
<div class="panel-group" id="tutλname">
	λtuts→(<div class="panel panel-default">
		<div class="panel-heading">
			<h4 class="panel-title">
				<a data-toggle="collapse" data-parent="#tutλname" href="#tutλnameλkey">
					λ(key+offset). Tutorium (λtopics)
				</a>
			</h4>
		</div><div id="tutλnameλkey" class="panel-collapse collapse λisOpen?in">
			<div class="panel-body">
				<p><h3><a href="λname/λ(key<9?'0'+(key+offset):(key+offset)).pdf">Folien</a></h3><br>
					Inhalt:<ul> λtopics.split(",")→(<li>λval</li>) </ul>
				</p>
				λfiles?(<p>Dateien:
				<ul>
					λfiles→(
						<li><a href="λname/λkey">λkey (λval)</a>
					)
				</ul>
				</p>)
				λtext?(<p>λtext</p>)
			</div>
		</div>
	</div>)
</div>
</script>

<script src="lib/lam_fill/λ.js"></script>
<script>
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
<style>

body {
	animation: testing 1000s;
}


@keyframes testing {
	from {
		transform: rotate(0deg);
	}
	to {
		transform: rotate(90deg);
	}
}

</style>
