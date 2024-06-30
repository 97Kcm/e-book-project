const emblaNode = document.querySelector('.embla');
const options = { loop: true, delay: 100, play:true }
const autoPlayPlugin = EmblaCarouselAutoplay();
autoPlayPlugin.play = true;
const plugins = [autoPlayPlugin];
const emblaApi = EmblaCarousel(emblaNode, options, plugins);

console.log(emblaApi)
