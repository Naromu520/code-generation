import type { MenuProps } from 'ant-design-vue'

/**
 * 顶部导航菜单配置。
 * 通过修改该数组即可增删改菜单项，key 对应路由 path。
 */
export const headerMenuItems: NonNullable<MenuProps['items']> = [
  {
    key: '/',
    label: '主页',
    title: '主页',
  },
  {
    key: '/about',
    label: '关于',
    title: '关于',
  },
]
