run: 
	npx shadow-cljs watch app

enable-linter:
	clj-kondo --lint "$(lein classpath)" --dependencies --parallel --copy-configs