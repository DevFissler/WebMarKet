import { createRouter, createWebHistory } from "vue-router";
import HomeView from "../views/HomeView.vue";
import ResultView from "../views/ResultView.vue";
import DetailView from "../views/DetailView.vue";

const routes = [
  {
    path: "/",
    name: "home",
    component: HomeView,
  },
  {
    path: "/voting",
    name: "voting",
    component: () =>
      import(/* webpackChunkName: "about" */ "../views/VotingView.vue"),
  },
  {
    path: "/result",
    name: "result",
    component: ResultView,
  },
  {
    path: "/result/detail",
    name: "detail",
    component: DetailView,
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
