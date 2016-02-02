<?php
if(!isset($_GET['f'])) die();
$file = explode('/',$_GET['f']);
$fname = array_pop($file);
$folder = array_pop($file);
$file = "$folder/$fname";
$info = pathinfo($file);
if($info['extension']!=="java") die();
?>
<link rel=stylesheet href="lib/monokai.css">
<body class="hljs">
<script src="lib/highlight.js"></script>
<script>
hljs.configure({tabReplace:'    '});
hljs.initHighlightingOnLoad();
</script>
<a class="hljs-title" download href="<?=$file?>">Download</a>
<pre><code class="java"><?=htmlspecialchars(file_get_contents($file)); ?></code></pre>
