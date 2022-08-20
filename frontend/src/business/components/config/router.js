/* eslint-disable */
export default {
  name: "Config",
  path: "/config",
  redirect: "/config/config",
  components: {
    content: () => import(/* webpackChunkName: "setting" */ '@/business/components/config/base')
  },
  children: [
    {
      path: "config",
      name: "config",
      component: () => import(/* webpackChunkName: "api" */ '@/business/components/config/home/Config'),
    },
  ]
}
